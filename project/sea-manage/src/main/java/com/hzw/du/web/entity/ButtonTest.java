package com.hzw.du.web.entity;

public class ButtonTest
{
    private Integer buttonId;
    
    private String  buttonName;  
   
    private Integer pId;
    
    private String  buttonStr;
    
    private Integer menuId;
   
    private String menuName;
    
    private Integer parentId;
    
    
    public Integer getMenuId()
    {
        return menuId;
    }

    public void setMenuId(Integer menuId)
    {
        this.menuId = menuId;
    }

    public Integer getpId()
    {
        return pId;
    }

    public void setpId(Integer pId)
    {
        this.pId = pId;
    }

    public Integer getButtonId()
    {
        return buttonId;
    }

    public void setButtonId(Integer buttonId)
    {
        this.buttonId = buttonId;
    }

    public String getButtonName()
    {
        return buttonName;
    }

    public void setButtonName(String buttonName)
    {
        this.buttonName = buttonName;
    }
    public String getButtonStr()
    {
        return buttonStr;
    }

    public void setButtonStr(String buttonStr)
    {
        this.buttonStr = buttonStr;
    }

  

    

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public Integer getParentId()
    {
        return parentId;
    }

    public void setParentId(Integer parentId)
    {
        this.parentId = parentId;
    }

    public ButtonTest()
    {
        super();
    }

    public ButtonTest(Integer menuId, String buttonStr)
    {
        super();
        this.menuId = menuId;
        this.buttonStr=buttonStr;
    }

    public ButtonTest(Integer buttonId, String buttonName, Integer pId)
    {
        super();
        this.buttonId = buttonId;
        this.buttonName = buttonName;
        this.pId = pId;
    }

    public ButtonTest( String menuName, Integer parentId,Integer menuId)
    {        
        this.menuName = menuName;
        this.parentId = parentId;
        this.menuId = menuId;
    }
    
    
}
