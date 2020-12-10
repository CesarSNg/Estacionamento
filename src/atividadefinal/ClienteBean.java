/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefinal;

/**
 *
 * @author CESAR
 */
public class ClienteBean {

   private Integer codCli;
   private String nomeCli;
   private String emailCli;
   private String telResCli;
   private String telComCli;
   private String telCelCli;
   
   public ClienteBean() {
       
   }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        this.codCli = codCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getTelResCli() {
        return telResCli;
    }

    public void setTelResCli(String telResCli) {
        this.telResCli = telResCli;
    }

    public String getTelComCli() {
        return telComCli;
    }

    public void setTelComCli(String telComCli) {
        this.telComCli = telComCli;
    }

    public String getTelCelCli() {
        return telCelCli;
    }

    public void setTelCelCli(String telCelCli) {
        this.telCelCli = telCelCli;
    }

   
}
