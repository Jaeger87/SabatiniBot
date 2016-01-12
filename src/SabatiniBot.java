import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.MessageToSend;
import com.botticelli.bot.request.methods.types.Message;
import com.botticelli.bot.request.methods.types.User;


public class SabatiniBot extends Bot{

	
	public SabatiniBot(String token) {
		super(token);
		//FileHandler fh;
		//try 
		//{
			//fh = new FileHandler("Saba.log");
	        //SimpleFormatter formatter = new SimpleFormatter();  
	        //fh.setFormatter(formatter);
	        //getErrorLogger().addHandler(fh);
		//} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}  

	}

	@Override
	public void textMessage(Message m) 
	{
		String text = m.getText();
		if(text.equals("mai"))
		{
			MessageToSend mts = new MessageToSend(m.getChat().getId(), "Maicon?");
			sendMessage(mts);
		}
		
		if(text.equals("25") || text.contains("25"))
		{
			MessageToSend mts = new MessageToSend(m.getChat().getId(), "25 fischioni, er novo Nesta!");
			sendMessage(mts);
		}
		
		if(text.contains("daje") || text.contains("Daje"))
				{
					MessageToSend mts = new MessageToSend(m.getChat().getId(), "Digne");
					sendMessage(mts);
				}
		if(text.contains("eddaje") || text.contains("Eddaje"))
				{
					MessageToSend mts = new MessageToSend(m.getChat().getId(), "EDDigne");
					sendMessage(mts);
				}	
		if(text.contains("ciao")||text.contains("come va")||text.contains("Adriano")||text.contains("Galliani")||text.contains("Si"))
		{
			MessageToSend mts = new MessageToSend(m.getChat().getId(), "Ashley Cole pe du milioni? Buoni pasto?");
			sendMessage(mts);
		}
		
		if(m.getReplyToMessage() != null)
		{
			if(m.getReplyToMessage().getText().equals("Ashley Cole pe du milioni? Buoni pasto?"))
			{
				if(text.equals("si"))
				{
					MessageToSend mts = new MessageToSend(m.getChat().getId(), "Allora pe e 5 a Conca D'oro, fori ar baretto, m'a arriccomanno puntuale");
					sendMessage(mts);
				}
				
				if(text.equals("no"))
				{
					MessageToSend mts = new MessageToSend(m.getChat().getId(), "Manco se aggiungo tre bietti der cinema e Torosidis?");
					sendMessage(mts);
				}
			}
			
		}
	}
	
	
	@Override
	public void newChatParticipantMessage(Message m) {
		User u = m.getNewChatParticipant(); 
		MessageToSend mts = new MessageToSend(m.getChat().getId(), "Bella " + u.getFirstName() + ", ma che lo voi Ashley Cole? Pure un piatto de pasta?");
		sendMessage(mts);
		
	}
	@Override
	public void audioMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contactMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void documentMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void groupChatCreatedMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void groupChatPhotoDeleteMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leftChatParticipantMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locationMessage(Message m) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void newChatPhotoMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newChatTitleMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void photoMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stickerMessage(Message m) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void videoMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceMessage(Message m) {
		// TODO Auto-generated method stub
		
	}

}
