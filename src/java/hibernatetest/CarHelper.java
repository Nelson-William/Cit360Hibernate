/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatetest;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author willnelson
 * Sandboxed and adjusted based on https://netbeans.org/kb/docs/web/hibernate-webapp.html
 */
public class CarHelper {
    
    Session session = null;
    
    public CarHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getCarModels(int idcar) {
        List<Car> modelList = null;
        try{
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Car as model where model.idcar in (select model.idcar from Car as model where model.idcar='" + idcar + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelList;
    }
}
