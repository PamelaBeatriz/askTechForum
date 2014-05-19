package asktechforum.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

import asktechforum.dominio.Pergunta;
import asktechforum.repositorio.CadastroPerguntasDAO;
import interfaces.CadastroPergunta;

public class CadastroPerguntaBC implements CadastroPergunta {

	private CadastroPerguntasDAO cadastro;
	private ArrayList<Pergunta> lstPergunta;

	public CadastroPerguntaBC() {
		CadastroPerguntasDAO cadastro = new CadastroPerguntasDAO();
	}

	@Override
	public void adcionarPergunta(Pergunta pergunta) {
		// TODO Auto-generated method stub
		try {
			if (pergunta.getData() == null) {

			} else if (pergunta.getDescricao().isEmpty()) {

			} else if (pergunta.getHora() == null) {

			} else if (pergunta.getTitulo().isEmpty()) {

			} else if (pergunta.getUsuario() == 0) {

			} else {
				cadastro.adcionarPergunta(pergunta);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void adcionarTag(int pergunta, int tag) {
		// TODO Auto-generated method stub
		try {
			if (pergunta == 0) {

			} else if (tag == 0) {

			} else {
				cadastro.adcionarTag(pergunta, tag);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void removerTag(int pergunta, int tag) {
		try {
			if (pergunta == 0) {

			} else if (tag == 0) {

			} else {
				cadastro.removerTag(pergunta, tag);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletarPergunta(int id) {
		// TODO Auto-generated method stub
		try {
			if (id == 0) {

			} else {
				cadastro.deletarPergunta(id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Pergunta consultarPerguntaPorIdPergunta(int id) {

		Pergunta pergunta = new Pergunta();
		try {
			if (id == 0) {

			} else {
				pergunta = cadastro.consultarPerguntaPorIdPergunta(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pergunta;
	}

	@Override
	public ArrayList<Pergunta> consultarPerguntaIdUsuario(int id)
			throws SQLException {
		this.lstPergunta = new ArrayList<Pergunta>();
		try {

			if (id == 0) {

			} else {
				this.lstPergunta = cadastro.consultarPerguntaIdUsuario(id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstPergunta;
	}

	@Override
	public ArrayList<Pergunta> consultarTodasPerguntas() {
		lstPergunta = new ArrayList<Pergunta>();
		try {

			this.lstPergunta = cadastro.consultarTodasPerguntas();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstPergunta;
	}

	@Override
	public ArrayList<Pergunta> consultarPerguntaPorTag(int id) {
		lstPergunta = new ArrayList<Pergunta>();
		try {
			if (id == 0) {

			} else {
				lstPergunta = cadastro.consultarPerguntaPorTag(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstPergunta;

	}

}
