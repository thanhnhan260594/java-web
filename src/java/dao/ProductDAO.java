package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public class ProductDAO {

    public ArrayList<Product> getListProductByCategory(int cate_id) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products WHERE id_cate = " + cate_id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getInt("id_product"));
            product.setProductName(rs.getString("name_product"));
            product.setProductImage(rs.getString("image"));
            product.setProductPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("description"));
            product.setProductSlug(rs.getString("slug_product"));
            list.add(product);
        }
        return list;
    }

    public Product getProduct(int productID) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products WHERE id_product = " + productID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getInt("id_product"));
            product.setProductName(rs.getString("name_product"));
            product.setProductImage(rs.getString("image"));
            product.setProductPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("description"));
        }
        return product;
    }

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
//        for (Product ds : dao.getListProductByCategory(1)) 
//        {
//            System.out.println(ds.getProductName() + " - ");
//        }
        System.out.println(dao.getProduct(1).getProductID() + " - " + dao.getProduct(1).getProductName());
    }
}
