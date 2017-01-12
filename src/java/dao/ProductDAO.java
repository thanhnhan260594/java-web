package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

public class ProductDAO {

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

    public int countProductByCategory(long cate_id) throws SQLException {
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

    // lấy sản phẩm mới nhất       
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

    //lấy danh sách sản phẩm 
    public ArrayList<Product> getListProduct() throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM products ORDER BY id_sup ASC";
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
            product.setProductDate(rs.getString("date_update"));
            product.setCategoryID(rs.getLong("id_cate"));
            product.setProductID(rs.getLong("id_sup"));
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

    public boolean insertProduct(Product s) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO products VALUE (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, s.getProductID());
            ps.setString(2, s.getProductName());
            ps.setDouble(3, s.getProductPrice());
            ps.setString(4, s.getProductSlug());
            ps.setString(5, s.getProductImage());
            ps.setString(6, s.getProductDescription());
            ps.setLong(7, s.getSupplyID());
            ps.setLong(8, s.getCategoryID());
            ps.setString(9, s.getProductDate());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateProduct(Product s) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "UPDATE products SET name_product = ?, price = ?, image = ?, description = ?, id_sup = ?, id_cate= ?, date_update= ? WHERE id_product = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, s.getProductName());
            ps.setDouble(2, s.getProductPrice());
            ps.setString(3, s.getProductImage());
            ps.setString(4, s.getProductDescription());
            ps.setLong(5, s.getSupplyID());
            ps.setLong(6, s.getCategoryID());

            ps.setLong(7, s.getProductID());
            return ps.executeUpdate() == 1;
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteProduct(long id_sup) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "DELETE FROM supplies WHERE id_sup = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, id_sup);
            return ps.executeUpdate() == 1;

        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
//        for (Product ds : dao.getListNewProduct()) {
//            System.out.println(ds.getProductImage() + " - ");
//        }
//        System.out.println(dao.countProductByCategory(1));

        System.out.println(dao.insertProduct(new Product(100, "TEST", 2000.000, "test", "somi01.jpg", "test", 1, 2, "2016-03-10")));
    }
}
