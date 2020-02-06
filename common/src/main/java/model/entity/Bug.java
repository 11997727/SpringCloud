package model.entity;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: common
 * @Package model.entity
 * @Description:
 * @date 2020/2/4 星期二 12:39
 */
public class Bug {
    private Integer id;
    private String name;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
