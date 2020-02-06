package model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
  private Integer sid;
  private String sname;
  private Integer sage;
  private Integer gender;
  private Integer xuefen;
  private String pwd;
  private Integer team;
  private String role;
  private Integer status;
  private String touxiang;
}
