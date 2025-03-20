package com.yupi.springbootinit.model.vo;


import com.yupi.dubbocommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;


/**
 * 接口信息封装信息
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {



    //阿里规约所有POJO都使用包装类
    private Integer totalNum;

    private static final long serialVersionUID = 3898590239097633734L;

}
