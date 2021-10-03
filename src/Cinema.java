public class Cinema {
    private String horaSessao;
    private String tipoIngresso;

    public Cinema() {
    }

    public Cinema(String horaSessao, String tipoIngresso) {
        this.horaSessao = horaSessao;
        this.tipoIngresso = tipoIngresso;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    // public boolean cadeiraVazia(String[][] cadeira, int coluna, int fila) {
    // if (cadeira[coluna][fila] == null) {
    // return true;
    // } else
    // return false;

    // }

    // public void comprarIngresso(String[][] cadeira, int coluna, int fila) {
    // if (cadeiraVazia(cadeira, coluna, fila) == true) {
    // cadeira[coluna][fila] = tipoCliente;
    // }
    // }

}