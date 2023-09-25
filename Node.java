class ArvoreNode {
    private int data;
    private ArvoreNode esquerda;
    private ArvoreNode direita;

    public ArvoreNode(int data) {
        this.data = data;
        this.esquerda = null;
        this.direita = null;
    }
    public int getData() {
    	return data;
    }
    public ArvoreNode getEsquerda() {
    	return esquerda;
    }
    public ArvoreNode getDireita() {
    	return direita;
    }
    public void setEsquerda(ArvoreNode esquerda) {
    	this.esquerda = esquerda;
    }
    public void setDireita(ArvoreNode direita) {
    	this.direita = direita;
    }
}
