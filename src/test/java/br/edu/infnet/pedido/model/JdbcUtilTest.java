package br.edu.infnet.pedido.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JdbcUtilTest {
    @Test
    public void test(){
        try {
            JdbcUtil.obterConexao();
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
