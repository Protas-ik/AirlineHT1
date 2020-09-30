package services;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Comparator;
import java.util.List;

public class CommonService {

    public static final Logger LOG = Logger.getLogger(CommonService.class.getName());


    public CommonService() {
    }

    public <T> void sort(List<T> list, Comparator comparator) {
        if(list == null){
            LOG.warn("List is null");
            throw new NullPointerException("List is null");
        }
        LOG.log(Level.DEBUG,"List: "+list);
        list.sort(comparator);
        LOG.log(Level.DEBUG,"List: "+list);

    }

    public <T> void add(List<T> list,T item) {
        if(list == null){
            LOG.warn("List is null");
            throw new NullPointerException("List is null");
        }
        if(item == null){
            LOG.warn("Item is null");
            throw new NullPointerException("Item is null");
        }
        LOG.log(Level.DEBUG,"List: "+list);
        list.add(item);
        LOG.log(Level.DEBUG,"List: "+list);
    }

}
