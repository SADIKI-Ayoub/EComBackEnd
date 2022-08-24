package com.ecommerce.backEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ecommerce.entities.Address;
import com.ecommerce.entities.Category;
import com.ecommerce.entities.OrderDetails;
import com.ecommerce.entities.Orders;
import com.ecommerce.entities.Product;
import com.ecommerce.entities.User;
import com.ecommerce.projection.ProductProjection;
import com.ecommerce.repository.ProductRepository;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EntityScan(basePackages={"com.ecommerce"})
//@EnableJpaRepositories(basePackageClasses = ProductRepository.class)
@EnableJpaRepositories(basePackages={"com.ecommerce.repository"})
public class BackEndApplication implements CommandLineRunner{

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Product.class, Category.class,Address.class,User.class, Orders.class, OrderDetails.class);
		repositoryRestConfiguration.getProjectionConfiguration().addProjection(ProductProjection.class);
		
	}

}
