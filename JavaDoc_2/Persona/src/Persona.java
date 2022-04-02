public class Persona {
   
    private String nome;
    private String cognome;
    private String codice;
    

    /**
     * Costruisce un oggetto dato il nome, il cognome e il codice fiscale (trasformato in automatico in maiuscolo). Se il codice fiscale non e' valido allora verra' creato un oggetto Persona con tutti gli attributi con stringa vuota. 
     * <br><strong>CONTROLLO sul CODICE FISCALE:</strong>
        <ul>
        <li> Il codice deve essere di 16 caratteri alfanumerici</li>
        <li> Il codice non deve contenere spazi </li>
        <li> I prime 6 caratteri devono essere delle consonanti </li>
        <li> Settimo e ottavo carattere devono essere numeri</li>
        </ul>
     * @param nome stringa qualsiasi da assegnare come nome di un nuovo oggetto Persona
     * @param cognome stringa qualsiasi da assegnare come cognome di un nuovo oggetto Persona
     * @param codice stringa che rappresenta il nuovo codice fiscale dell'oggetto Persona
     */
    public Persona(String nome, String cognome, String codice) {
    
        codice = codice.toUpperCase();
        if (codice.length() == 16 && codice.trim().length() > 0)
        {
            if(!codice.substring(0,6).matches(".*[AEIOU].*"))
            {
                if(codice.substring(6,7).matches(".*[0-9].*") && codice.substring(7,8).matches(".*[0-9].*"))
                {
                    setNome(nome);
                    setCognome(cognome);
                    setCodice(codice);
                    return;
                }
            }
        }
        setNome("");
        setCodice("");
        setCognome("");
    }
    /**
     * Il metodo stabilisce se due persone sono omonime; Restituisce un booleano: VERO se le due persone hanno lo stesso nome (senza distinzione di maiuscole e minuscole) altrimenti FALSO
     * @param p oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti falso
     */
    public boolean isOmonimo(Persona p)
    {
        return (getNome().equals(p.getNome()) && getCognome().equals(p.getCognome()));
    }

    /**
     * restituisce una stringa contenente il nome della persona
     * @return il nome di un oggetto Persona
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * assegna una Stringa come nome di una persona
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * restituisce una Stringa contenente il cognome della persona
     * @return il cognome di un oggetto Persona
     */
    public String getCognome() {
        return this.cognome;
    }
    /**
     * assegna una Stringa come cognome di una persona
     * @param cognome nuova stringa da assegnare come cognome a un oggetto Persona già  esistente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    /**
     * restituisce una stringa contenente il codice fiscale di una persona
     * @return il codice fiscale di un oggetto persona 
     */
    public String getCodice() {
        return this.codice;
    }
    /**
     * assegna una stringa come codice fiscale di una persona
     * @param codice nuova stringa da assegnare come codice fiscale a un oggetto persona
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }


    /**
     * Restituisce una rappresentazione testuale di un oggetto Persona
     * @return La rappresentazione testuale di un oggetto Persona
     */
    @Override
    public String toString() {
        return 
            "\nNome='" + getNome() + "'" +
            "\nCognome='" + getCognome() + "'" +
            "\nCodice='" + getCodice() + "'" ;
            
    }
}
