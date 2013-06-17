package com.mf.penagihan.dao;

import com.mf.common.domain.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created with IntelliJ IDEA.
 * User: antonius
 * Date: 6/17/13
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class NasabahDAO {

    @Autowired private DataSource dataSource;

    public void simpan(Nasabah n) throws Exception {
        String sql = "insert into m_nasabah(nomer,nama) values (?,?)";

        Connection connection = dataSource.getConnection();

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "N-001");
        ps.setString(2, "Nasabah 001");
        ps.executeUpdate();

        connection.close();
    }
}
