# E-COMMERCE WEBAPP

# DAY - 1
<hr>

**Product Design**
------------------
`id             => Primary key` <br>
`name           => String`      <br>
`Description    => String`      <br>
`Brand          => String`      <br>
`Price          => int`         <br>
`Category       => String`      <br>
`ReleaseDate    => Date`        <br>
`Available      => boolean`     <br>
`Quantity       => int`         <br>
`Image          => Optional`    <br>

**Key Concepts and Tricks**
---------------------------

1. ### Repository Generation
   - Interface `ProductRepo` extends `JpaRepository` that helps in connection with the database.
   - It takes two arguments `Product` - The table to be created and `Integer` - the Primary Key of the table.

2. ### Primary Key and Index Generation
   - Tag for Primary Key => `Id`
   - For Automatic ID Generation => `@GeneratedValue(strategy = GenerationType.IDENTITY)`

3. ### Handling CORS Error
   - Just annotate the `Controller` class with `@CrossOrigin`.

4. ### ResponseEntity
   - It encapsulates **the Response data with the status code**.
    ```
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }
    ```

4. ### Creation of Default Data in SQL
   - Create a `data.sql` file in resources.
   - Add the `Insert Into Product(...) VALUES(...)` command.

5. ### Date Formatting
   - We can change the dates into the normal _dd-MM-yyyy_ format.
   ```
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
   private Date releaseDate;
   ```

### _ProTip : If Any method returns an Optional data, handle it with .orElse / .get_

