/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Supply;

/**
 *
 * @author thanh_000
 */
public class SupplyDAO {
    public ArrayList<Supply> getListSupply() throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM supplies ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Supply> list = new ArrayList<>();
        while (rs.next()) {
            Supply supply = new Supply();
            supply.setSupplyID(rs.getInt("id_sup"));
            supply.setSupplyName(rs.getString("name_sup"));
            supply.setSupplySlug(rs.getString("slug_sup"));
            list.add(supply);
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        SupplyDAO dao = new SupplyDAO();
        for (Supply ds : dao.getListSupply()) {
            System.out.println(ds.getSupplyName() + " - " + ds.getSupplySlug());
        }
    }
}
