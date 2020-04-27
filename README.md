# Product CRUD API
Description: With this API developers will be able to INSERT, DELETE, UPDATE AND READ Products from a table "peoducts".
>Version: 1.0.0.

>Technologies - For this API i've used: 

>springboot framework with java 11.

>PostgreSQL to store DATA. 

# Testing
>This application is avaiable in Heroku with the base URL: https://crud-product-postgre-api.herokuapp.com

# Resources
> POST(/products)

>Description: This resource create a new product on the table "products".

> Payload Example :

    {
      "productName": "Fan",

      "productDescription": "110V Fan",

      "productPrice": "100.00"
 
     },

> Response Exemple :

     {
    
        "id": 1,
        
        "productName": "Fan",
        
        "productDescription": "110V Fan",
        
        "productPrice": "100.00"
        
    },

> GET(/products)

>Description: This resource shows all products registred on the table "products in a List".

> Payload Example :

    {

    }

> Response Example :

      [
    
       {
        "id": 1,
        
        "productName": "Fan",
        
        "productDescription": "Fan 110V",
        
        "productPrice": "100.00"
        
        },
      {
        "id": 2,
        
        "productName": "Stove",
        
        "productDescription": "White Stove",
        
        "productPrice": "1000.00"
        
       },
      
    {
        "id": 3,
        "productName": "Television",
        "productDescription": "TV 4K",
        "productPrice": "1500.00"
    }
    ]
    
> GET(/products/{id})

>Description: This resource shows a selected product by its Id".

> Payload Example :

    {

    }

> Response Example for (/products/1) :

       {
        "id": 1,
        
        "productName": "Fan",
        
        "productDescription": "Fan 110V",
        
        "productPrice": "100.00"
        
        },
        
 > PUT(/products)

>Description: This resource updates a product on the table "products".

> Payload Example :

    {
      "productName": "Fan",

      "productDescription": "110V Fan",

      "productPrice": "200.00"
 
     },

> Response Exemple :

     {
    
        "id": 1,
        
        "productName": "Fan",
        
        "productDescription": "110V Fan",
        
        "productPrice": "200.00"
        
    },
    
> DELETE(/products)

>Description: This resource deletes a product on the table "products".

> Payload Example for (/products/1) :

    {
 
     }

> Response Exemple :

     {

    }

>OBS: This application is ready to run locally too.
