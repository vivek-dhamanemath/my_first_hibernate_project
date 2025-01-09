# Hibernate Shopping Cart

This project is a simple shopping cart application using Hibernate for ORM (Object-Relational Mapping). It allows users to add products, create users with carts, add products to carts, remove products from carts, and view all products in a cart.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Database

## Setup Instructions

1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/Hibernate_Shopping_Cart.git
    cd Hibernate_Shopping_Cart
    ```

2. **Configure the database:**
    - Create a MySQL database named `yourdatabase`.
    - Update the database connection settings in `src/main/resources/hibernate.cfg.xml` with your MySQL username and password.

3. **Build the project:**
    ```sh
    mvn clean install
    ```

4. **Run the application:**
    ```sh
    mvn exec:java -Dexec.mainClass="com.hibernate.Hibernate_Shopping_Cart.App"
    ```

## Usage

1. **Add Product:**
    - Choose option `1` to add a new product.

2. **Add User with Cart:**
    - Choose option `2` to add a new user with an empty cart.

3. **Add Product to Cart:**
    - Choose option `3` to add a product to a user's cart.

4. **Remove Product from Cart:**
    - Choose option `4` to remove a product from a user's cart.

5. **Find All Products from Cart:**
    - Choose option `5` to list all products in a user's cart.

6. **Exit:**
    - Choose option `6` to exit the application.

## Project Structure

- `src/main/java/com/hibernate/Hibernate_Shopping_Cart/`: Contains the main application code.
- `src/main/resources/`: Contains the Hibernate configuration file (`hibernate.cfg.xml`).

## Dependencies

- Hibernate ORM
- MySQL Connector/J
- Apache Maven

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

