/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：系统工具类
 * 文件名称：SysUtil.java
 * 修改时间：2016-8-1
 * 修改人：张露
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.common;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.web.entity.ButtonTest;
import com.hzw.du.web.entity.Tree.Tree;

/**
 * <一句话功能简述> 静态工具类
 * @author zl
 * @version V1.0[产品/模块版本]
 */
public class SysUtil
{
    /**
     * 函数功能描述：转换List<Tree> 用于ztree树状图
     * @param buttonList
     * @return
     */
    public static List<Tree> packToTree(List<ButtonTest> buttonList)
    {
        List<Tree> listTree = new ArrayList<Tree>();
        if (buttonList.size() > 0) {
            for (int i = 0; i < buttonList.size(); i++) {
                ButtonTest button = buttonList.get(i);
                Tree tree = new Tree();
                tree.setId(button.getButtonId());
                tree.setName(button.getButtonName());
                tree.setpId(button.getpId());
                listTree.add(tree);
            }
        }
        return listTree;
    }
}
