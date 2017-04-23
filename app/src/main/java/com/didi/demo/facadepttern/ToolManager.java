package com.didi.demo.facadepttern;

/**
 * Created by map on 2017/4/4.
 */

public class ToolManager {
    private MediumTool mediumTool;
    private SuperTool superTool;
    private SeniorTool seniorTool;

    public ToolManager() {

        this.mediumTool = new MediumTool();
        this.superTool = new SuperTool();
        this.seniorTool = new SeniorTool();
    }

    public void superTool() {
        superTool.tool();
    }

    public void seniorTool() {
        seniorTool.tool();

    }

    public void mediumTool() {
        mediumTool.tool();
    }
}
