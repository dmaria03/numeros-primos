#include <stdio.h>

int main() {
    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);

    if (numero > 0) {
               
        printf("O numero eh positivo.\n");
    } else if (numero < 0) {
        printf("O numero eh negativo.\n");
    } else {
        printf("O numero eh zero.\n");
    }

    return 0;
}

