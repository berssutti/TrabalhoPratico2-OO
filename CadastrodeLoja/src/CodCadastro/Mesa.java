package CodCadastro;

public class Mesa extends Produto implements CRUD {
	
	private float medidas;
	private float pesoSuportavel;
	private String tipo;
	private String material;
	private float peso;
	
	
	public Mesa(float med, float ps, String t, String mat, float p) {
		
		medidas = med;
		pesoSuportavel = ps;
		tipo = t;
		material = mat;
		peso = p;
	}
	
	
	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}

	
	public float getMedidas() {
		return medidas;
	}

	public void setMedidas(float medidas) {
		this.medidas = medidas;
	}

	public float getPesoSuportavel() {
		return pesoSuportavel;
	}

	public void setPesoSuportavel(float pesoSuportavel) {
		this.pesoSuportavel = pesoSuportavel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
