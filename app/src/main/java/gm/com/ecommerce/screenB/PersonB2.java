package gm.com.ecommerce.screenB;

import java.util.List;

/**
 * Created by Comert on 2.08.2016.
 */
public class PersonB2
{
        private String pro;
        private String dolars;
        private int navos;
        private int icons;
        public List<PersonB> movie_list;

        public String getpro() {
            return pro;
        }
        public String getdolars() {
            return dolars;
        }
        public int getnavos() {
            return navos;
        }
        public int geticons() {
            return icons;
        }

        public PersonB2(String pro, String dolars, int icons,int navos)
        {
            this.pro=pro;
            this.dolars=dolars;
            this.icons=icons;
            this.navos=navos;

        }
}