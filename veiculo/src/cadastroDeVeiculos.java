
import java.util.ArrayList;
import java.util.List;

public class CadastroDeVeiculos {
    private final List<Object> veiculos;

    public CadastroDeVeiculos() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        boolean add = veiculos.add(veiculo);
    }

    public void removerVeiculo(String placa) {
        veiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public Object buscarVeiculo(String placa) {
        for (Object v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null; // Veículo não encontrado
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Object v : veiculos) {
                System.out.println();
            }
        }
    }
}
