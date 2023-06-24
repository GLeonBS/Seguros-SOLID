package org.example.transportes;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public abstract class Veiculo {
    Double valorFipe = 0D;

    public Double calcularValoFipe() {
        Double result = 0D;
        return result;
    }
}
