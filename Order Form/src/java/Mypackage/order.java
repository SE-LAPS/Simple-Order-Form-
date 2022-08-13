
package Mypackage;

import java.util.Vector;


class order {

    Vector displayorder(int tqty, int hqty) {
        int totprice_T = 15*tqty;
        int totprice_H = 10*hqty;
        
        Vector v = new Vector();
        v.add(totprice_T);
        v.add(totprice_H);
        
        return v;
        
        
    }
}
