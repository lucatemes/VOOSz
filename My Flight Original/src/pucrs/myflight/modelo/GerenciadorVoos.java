package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    private ArrayList<Voo> voos= new ArrayList<>();

    public void adicionar(Voo v1){
        voos.add(v1);
    }

    //lista todos voos

    public void listarTodos(){
        int contador =0;
        for(Voo lista : voos ){
            System.out.println("=================================");
            System.out.print("NÚMERO DO VOO: ");
            System.out.println(voos.indexOf(lista) + 1);
            System.out.print("DATA/HORA: ");
			System.out.println(lista.getDatahora());
            System.out.print("DURAÇÃO: ");
			System.out.println(lista.getDuracao());
            System.out.print("STATUS: ");
			System.out.println(lista.getStatus());
            System.out.print("ROTA: ");
			System.out.print(lista.getRota().getOrigem().getNome());
            System.out.print(" X ");
            System.out.println(lista.getRota().getDestino().getNome());
            System.out.print("LUGARES DISPONÍVEIS: ");
            System.out.println(lista.getLugares());
            System.out.print("==================================");
            contador++;
		}
        if(contador == 0){
            System.out.println("Nenhum voo encontrado.");
        }
    }

    // busca voos por rota

    public void buscarPorRota(String origem, String destino){
        int contador= 0;
        for(Voo lista : voos){
            if(lista.getRota().getOrigem().getNome().equals(origem) && lista.getRota().getDestino().getNome().equals(destino)){
                contador++;
                System.out.println("=================================");
                System.out.print("NÚMERO DO VOO: ");
                System.out.println(voos.indexOf(lista) + 1);
                System.out.print("DATA/HORA: ");
			    System.out.println(lista.getDatahora());
                System.out.print("DURAÇÃO: ");
			    System.out.println(lista.getDuracao());
                System.out.print("STATUS: ");
			    System.out.println(lista.getStatus());
                System.out.print("ROTA: ");
			    System.out.print(lista.getRota().getOrigem().getNome());
                System.out.print(" X ");
                System.out.println(lista.getRota().getDestino().getNome());
                System.out.print("LUGARES DISPONÍVEIS: ");
                System.out.println(lista.getLugares());
                System.out.println("=================================");
            }
        }
        if(contador == 0){
            System.out.println("Voo não encontrado.");
        }
    }


    // busca voos por destino

    public void buscarPorDestino(String destino){
        int contador= 0;
        for(Voo lista : voos){
            if(destino.equals(lista.getRota().getDestino().getNome())){
                System.out.println("=================================");
                System.out.print("NÚMERO DO VOO: ");
                System.out.println(voos.indexOf(lista) + 1);
                System.out.print("DATA/HORA: ");
			    System.out.println(lista.getDatahora());
                System.out.print("DURAÇÃO: ");
			    System.out.println(lista.getDuracao());
                System.out.print("STATUS: ");
			    System.out.println(lista.getStatus());
                System.out.print("ROTA: ");
			    System.out.print(lista.getRota().getOrigem().getNome());
                System.out.print(" X ");
                System.out.println(lista.getRota().getDestino().getNome());
                System.out.print("LUGARES DISPONÍVEIS: ");
                System.out.println(lista.getLugares());
                System.out.println("=================================");
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("Voo não encontrado.");
        }
    }

    // busca voos por origem

    public void buscarPorOrigem(String origem){
        int contador =0;
        for(Voo lista : voos){
            if(origem.equals(lista.getRota().getOrigem().getNome())){
                System.out.println("=================================");
                System.out.print("NÚMERO DO VOO: ");
                System.out.println(voos.indexOf(lista) + 1);
                System.out.print("DATA/HORA: ");
			    System.out.println(lista.getDatahora());
                System.out.print("DURAÇÃO: ");
			    System.out.println(lista.getDuracao());
                System.out.print("STATUS: ");
			    System.out.println(lista.getStatus());
                System.out.print("ROTA: ");
			    System.out.print(lista.getRota().getOrigem().getNome());
                System.out.print(" X ");
                System.out.println(lista.getRota().getDestino().getNome());
                System.out.print("LUGARES DISPONÍVEIS: ");
                System.out.println(lista.getLugares());
                System.out.println("=================================");
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("Voo nao encontrado.");
        }
    }

    // busca voos por data

    public void buscarPorData(LocalDateTime data){
        int contador =0;
        for(Voo lista : voos){
            if(data == lista.getDatahora()){
                System.out.println("=================================");
                System.out.print("NÚMERO DO VOO: ");
                System.out.println(voos.indexOf(lista) + 1);
                System.out.println("|ROTA|");
                System.out.print(lista.getRota().getOrigem().getNome());
                System.out.print(" X ");
                System.out.println(lista.getRota().getDestino().getNome());
                System.out.println("|DURAÇÃO|");
                System.out.println(lista.getDuracao());
                System.out.println("=================================");
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("Voo não encontrado.");
        }
    }

    //reserva tickets de voo

    public void comprarTicket(int nVoo, int qtdBilhete){
        int newVoo= nVoo - 1;
        int contador= 0;
        if(newVoo >= 0){
        for(Voo lista: voos){
            if(newVoo == voos.indexOf(lista)){
                if(qtdBilhete > 0 && qtdBilhete <= lista.getLugares()){
                lista.setLugares(lista.getLugares() - qtdBilhete);
                System.out.println("Compra efetuada com sucesso, lugares disponíveis: " + lista.getLugares());
                }else{
                    System.out.println("Não é possível fornecer esta quantidade de bilhetes.");
                }
                contador++;
            
            }
        }
        }
        if(contador == 0){
            System.out.println("Nenhum voo com este código encontrado.");
        }
    }

    public void buscarGeral(String origem, String destino, int lugaresMinimos){
        int contador= 0;
        for(Voo lista : voos){
            if(lista.getRota().getOrigem().getNome().equals(origem) && lista.getRota().getDestino().getNome().equals(destino) && lista.getLugares() >= lugaresMinimos){
                contador++;
                System.out.println("=================================");
                System.out.print("NÚMERO DO VOO: ");
                System.out.println(voos.indexOf(lista) + 1);
                System.out.print("DATA/HORA: ");
			    System.out.println(lista.getDatahora());
                System.out.print("DURAÇÃO: ");
			    System.out.println(lista.getDuracao());
                System.out.print("STATUS: ");
			    System.out.println(lista.getStatus());
                System.out.print("ROTA: ");
			    System.out.print(lista.getRota().getOrigem().getNome());
                System.out.print(" X ");
                System.out.println(lista.getRota().getDestino().getNome());
                System.out.print("LUGARES DISPONÍVEIS: ");
                System.out.println(lista.getLugares());
                System.out.println("=================================");
            }
        }
        if(contador == 0){
            System.out.println("Voo não encontrado.");
        }
    }
}   