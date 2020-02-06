package model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {

  private Integer id;
  private String username;
  private String password;
  private Integer age;
  private Integer sex;
  private String nickname;
  private String moblie;
  private String address;
  private Integer supper;
  private String prcpath;


}
