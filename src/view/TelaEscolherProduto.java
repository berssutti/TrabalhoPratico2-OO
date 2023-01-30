package view;
/**
 * Implementa uma interface para escolher o produto que ser� comprado 
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021]
 */
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import control.ControlArmario;
import control.ControlCadeira;
import control.ControlDados;
import control.ControlGeladeira;
import control.ControlLavaLoucas;
import control.ControlMesa;
import control.ControlMicroondas;

public class TelaEscolherProduto implements ListSelectionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JList<String> listaCadeirasCadastradas;
	private JList<String> listaArmariosCadastrados;
	private JList<String> listaMesasCadastradas;
	private JList<String> listaMicroondasCadastrados;
	private JList<String> listaGeladeirasCadastradas;
	private JList<String> listaLavaLoucasCadastradas;
	private String[] listaNomes = new String[50];
	private int posicaoCliente;
	private ControlDados dados;
	private JList<String> listaProdutosCadastrados;
	private int controlSelecionado;
	/**
	 * Mostra a lista de produtos que podem ser comprados
	 * @param dados, permite o acesso aos dados dos produtos
	 * @param op, representa o produto selecionado
	 * @param posicaoCliente, posi��o do cliente selecionado na JList
	 */
	public void mostrarProdutos(ControlDados dados, int op, int posicaoCliente) {
		
		this.posicaoCliente = posicaoCliente;
		this.dados = dados;
		switch (op) {
		case 1:// Mostrar dados de cadeiras cadastrados
			this.controlSelecionado = 1;
			
			listaNomes = new ControlCadeira(dados).getNomeCadeira();
			listaCadeirasCadastradas = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaCadeirasCadastradas;
			janela = new JFrame("Cadeiras");
			titulo = new JLabel("Escolha uma cadeira");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaCadeirasCadastradas.setBounds(20, 50, 350, 120);
			listaCadeirasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCadeirasCadastradas.setVisibleRowCount(10);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaCadeirasCadastradas);

			janela.setSize(400, 250);
			janela.setVisible(true);
			
			listaCadeirasCadastradas.addListSelectionListener(this);
			
			break;
		case 2:// Mostrar dados de Mesas cadastradas
			this.controlSelecionado = 2;

			listaNomes = new ControlMesa(dados).getNomeMesa();
			listaMesasCadastradas = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaMesasCadastradas;
			janela = new JFrame("Mesas");
			titulo = new JLabel("Escolha uma Mesa");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaMesasCadastradas.setBounds(20, 50, 350, 120);
			listaMesasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMesasCadastradas.setVisibleRowCount(10);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaMesasCadastradas);	

			janela.setSize(400, 250);
			janela.setVisible(true);

			listaMesasCadastradas.addListSelectionListener(this);
			break;
		case 3:// Mostrar dados de Armarios cadastradas
			this.controlSelecionado = 3;
			
			listaNomes = new ControlArmario(dados).getNomeArmario();
			listaArmariosCadastrados = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaArmariosCadastrados;
			janela = new JFrame("Armarios");
			titulo = new JLabel("Escolha um Armario");	
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaArmariosCadastrados.setBounds(20, 50, 350, 120);
			listaArmariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmariosCadastrados.setVisibleRowCount(10);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaArmariosCadastrados);
		
			janela.setSize(400, 250);
			janela.setVisible(true);

			listaArmariosCadastrados.addListSelectionListener(this);
			break;
		case 4:// Mostrar dados de Geladeiras cadastradas
			this.controlSelecionado = 4;
			
			listaNomes = new ControlGeladeira(dados).getNomeGeladeira();
			listaGeladeirasCadastradas = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaGeladeirasCadastradas;
			janela = new JFrame("Geladeiras");
			titulo = new JLabel("Escolha uma Geladeira");
		

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaGeladeirasCadastradas.setBounds(20, 50, 350, 120);
			listaGeladeirasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaGeladeirasCadastradas.setVisibleRowCount(10);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaGeladeirasCadastradas);


			janela.setSize(400, 250);
			janela.setVisible(true);

			listaGeladeirasCadastradas.addListSelectionListener(this);
			break;
		case 5:// Mostrar dados de Microondas cadastradas
			this.controlSelecionado = 5;
			
			listaNomes = new ControlMicroondas(dados).getNomeMicroondas();
			listaMicroondasCadastrados = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaMicroondasCadastrados;

			janela = new JFrame("Microondas");
			titulo = new JLabel("Escolha um Microondas");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaMicroondasCadastrados.setBounds(20, 50, 350, 120);
			listaMicroondasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMicroondasCadastrados.setVisibleRowCount(10);


			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaMicroondasCadastrados);

			janela.setSize(400, 250);
			janela.setVisible(true);

			listaMicroondasCadastrados.addListSelectionListener(this);
			break;
		case 6:// Mostrar dados de lava Lou�as cadastradas
			this.controlSelecionado = 6;
			
			listaNomes = new ControlLavaLoucas(dados).getNomeLavaLoucas();
			listaLavaLoucasCadastradas = new JList<String>(listaNomes);
			this.listaProdutosCadastrados = listaLavaLoucasCadastradas;
			janela = new JFrame("LavaLoucass");
			titulo = new JLabel("Escolha uma Lava Lou�as");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaLavaLoucasCadastradas.setBounds(20, 50, 350, 120);
			listaLavaLoucasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLavaLoucasCadastradas.setVisibleRowCount(10);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLavaLoucasCadastradas);

			janela.setSize(400, 250);
			janela.setVisible(true);

			listaLavaLoucasCadastradas.addListSelectionListener(this);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() &&( e.getSource() == listaCadeirasCadastradas || e.getSource() == listaArmariosCadastrados || e.getSource() == listaMesasCadastradas
				|| e.getSource() == listaMicroondasCadastrados|| e.getSource() == listaGeladeirasCadastradas|| e.getSource() == listaLavaLoucasCadastradas)) {
			new TelaConfirmacao().mostrarTela(2,posicaoCliente,listaProdutosCadastrados.getSelectedIndex(), controlSelecionado,dados);
		}
		
	}
}
