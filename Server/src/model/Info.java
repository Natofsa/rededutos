/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author natof
 */
public class Info {

    private final String ip;
    private final LinkedList<String> files;

    public Info(String ip, LinkedList<String> files) {
        this.ip = ip;
        this.files = files;
    }

    public String getIp() {
        return ip;
    }

    public LinkedList<String> getFiles() {
        return files;//retorna lista de arquivos contidos no cliente para concatenação da lista geral de arquivos no servidor.
    }
    
}
