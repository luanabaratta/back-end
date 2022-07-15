
public class Gerente extends Funcionario implements Autenticavel {
		
		private AutenticacaoUtil autenticador;

		Gerente() {
			this.autenticador = new AutenticacaoUtil();
		}
		
        public double getBonificacao() {
        	System.out.println("Chamando o m�todo de bonifica��o do gerente.");
            return super.getSalario();
        }

        @Override
    	public void setSenha(int senha) {
    		this.autenticador.setSenha(senha);
    	}

    	@Override
    	public boolean autentica(int senha) {
    		return this.autenticador.autentica(senha);
    		
    	}
        
}
