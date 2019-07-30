/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal.springjsftest.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {
    
    public String showHello(){
        return "hello from managed bean";
    }
    
}
