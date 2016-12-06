package model;

public class Product {
    private int ProductID;
    private String ProductName;
    private Double ProductPrice;
    private String ProductSlug;
    private String ProductImage;
    private String ProductDescription;
    private int SupplieID;
    private int CategoryID;

    public Product() { } 
    public Product(int ProductID, String ProductName, Double ProductPrice, String ProductImage, String ProductDescription, String ProductSlug) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductImage = ProductImage;
        this.ProductDescription = ProductDescription;
        this.ProductSlug = ProductSlug;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductSlug() {
        return ProductSlug;
    }

    public void setProductSlug(String ProductSlug) {
        this.ProductSlug = ProductSlug;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public int getSupplieID() {
        return SupplieID;
    }

    public void setSupplieID(int SupplieID) {
        this.SupplieID = SupplieID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }
    
}
