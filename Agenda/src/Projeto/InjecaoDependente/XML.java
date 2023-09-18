package Projeto.InjecaoDependente;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class XML implements Salvar{

	@Override
	public void salva(Agenda agenda) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Agenda");
			doc.appendChild(rootElement);

			Element nomeElement = doc.createElement("Nome");
			nomeElement.appendChild(doc.createTextNode(agenda.getNome()));
			rootElement.appendChild(nomeElement);

			Element telefoneElement = doc.createElement("Telefone");
			telefoneElement.appendChild(doc.createTextNode(agenda.getTelefone()));
			rootElement.appendChild(telefoneElement);

			Element nascimentoElement = doc.createElement("Nascimento");
			nascimentoElement.appendChild(doc.createTextNode(agenda.getNascimento()));
			rootElement.appendChild(nascimentoElement);

			Element emailElement = doc.createElement("Email");
			emailElement.appendChild(doc.createTextNode(agenda.getEmail()));
			rootElement.appendChild(emailElement);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream("agenda.xml"));
			transformer.transform(source, result);
			System.out.println("Arquivo XML salvo com sucesso.");
		} catch (ParserConfigurationException | TransformerException | IOException e) {
			throw new RuntimeException(e);
		}
	}


}
