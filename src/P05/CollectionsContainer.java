package P05;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsContainer {

    private List list;
    private Set set;
    private Map map;
    private Properties props;


    public List getList() {
        System.out.println("List: " + list);
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        System.out.println("Set: " + set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println("Map" + map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProps() {
        System.out.println("Props: " + props);
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
