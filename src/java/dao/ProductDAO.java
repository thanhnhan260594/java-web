package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public class ProductDAO {

//    public ArrayList<Product> getListProductByCategory(long cate_id) throws SQLException {
//        Connection connection = DBConnect.getConnecttion();
//        String sql = "SELECT * FROM products WHERE id_cate = " + cate_id;
//        PreparedStatement ps = connection.prepareCall(sql);
//        ResultSet rs = ps.executeQuery();
//
//        ArrayList<Product> list = new ArrayList<>();
//        while (rs.next()) {
//            Product product = new Product();
//            product.setProductID(rs.getLong("id_product"));
//            product.setProductName(rs.getString("name_product"));
//            product.setProductImage(rs.getString("image"));
//            product.setProductPrice(rs.getDouble("price"));
//            product.setProductDescription(rs.getString("description"));
//            product.setProductSlug(rs.getString("slug_product"));
//            list.add(product);
//        }
//        return list;
//    }
    
// lấy danh sách sản phẩm
    public ArrayList<Product> getListProductByPagesCategory(long cate_id, int firstResult, int maxResult) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products WHERE id_cate = '" + cate_id + "' limit ?,?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, firstResult);
        ps.setInt(2, maxResult);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("id_product"));
            product.setProductName(rs.getString("name_product"));
            product.setProductImage(rs.getString("image"));
            product.setProductPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("description"));
            product.setProductSlug(rs.getString("slug_product"));
            list.add(product);
        }
        return list;
    }
// tính tổng sản phẩm
    public int countProductByCategory(long cate_id) throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT count(id_product) FROM products WHERE id_cate = '" + cate_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
       
        ResultSet rs = ps.executeQuery();
        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }
        return count;
    }
            
    public ArrayList<Product> getListNewProduct() throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products ORDER BY date_update DESC";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("id_product"));
            product.setProductName(rs.getString("name_product"));
            product.setProductImage(rs.getString("image"));
            product.setProductPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("description"));
            product.setProductSlug(rs.getString("slug_product"));
            list.add(product);
        }
        return list;
    }

    public Product getProduct(long productID) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products WHERE id_product = " + productID;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getLong("id_product"));
            product.setProductName(rs.getString("name_product"));
            product.setProductImage(rs.getString("image"));
            product.setProductPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("description"));
        }
        return product;
    }

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
//        for (Product ds : dao.getListNewProduct()) {
//            System.out.println(ds.getProductImage() + " - ");
//        }
        System.out.println(dao.countProductByCategory(1));
    }
}
