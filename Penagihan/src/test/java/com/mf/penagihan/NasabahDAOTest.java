package com.mf.penagihan;

import com.mf.penagihan.dao.NasabahDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: antonius
 * Date: 6/17/13
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class NasabahDAOTest {

    @Test
    public void testSimpan() throws Exception {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath*:com/mf/**/applicationContext.xml");

        NasabahDAO n = (NasabahDAO) ctx.getBean("nasabahDAO");
        n.simpan(null);
    }
}
