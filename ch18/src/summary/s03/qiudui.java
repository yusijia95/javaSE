package summary.s03;

public class qiudui {
    private String name;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "qiudui{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
