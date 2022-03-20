CREATE DATABASE mall;

CREATE TABLE product
(
    product_id         INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    product_name       VARCHAR(128) NOT NULL,
    category           VARCHAR(32)  NOT NULL,
    image_url          VARCHAR(256) NOT NULL,
    price              INT          NOT NULL,
    stock              INT          NOT NULL,
    description        VARCHAR(1024),
    created_date       TIMESTAMP    NOT NULL,
    last_modified_date TIMESTAMP    NOT NULL
);

INSERT INTO product (product_name, category, image_url, price, stock, description, created_date, last_modified_date)
VALUES ('蘋果', 'FOOD', 'https://cdn.pixabay.com/photo/2014/02/01/17/28/apple-256261__480.jpg', 20, 10, '這是來自澳洲的蘋果!', '2022-03-01 02:41:28', '2022-03-01 02:41:32');

SELECT * FROM product;

SELECT product_id,
       product_name,
       category,
       image_url,
       price,
       stock,
       description,
       created_date,
       last_modified_date
FROM product
WHERE product_id = :productId;

INSERT INTO product (product_name, category, image_url, price, stock, description, created_date, last_modified_date)
VALUES (:productName, :category, :imageUrl, :price, :stock, :description, :createdDate, :lastModifiedDate);

UPDATE product SET product_name=:productName, category=:category, image_url=:imageUrl, price=:price, stock=:stock, description=:description, last_modified_date=:lastModifiedDate
WHERE product_id=:productId;

DELETE FROM product WHERE product_id=:productId;
