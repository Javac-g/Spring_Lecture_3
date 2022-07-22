package com.company.MainVersion.Service;

import com.company.MainVersion.Controller.Tool;

public class ResponseDTO {
    private String name;
    private Integer id;
    private Tool tool;
    private CarEnum carenum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public CarEnum getCarenum() {
        return carenum;
    }

    public void setCarenum(CarEnum carenum) {
        this.carenum = carenum;
    }
}
