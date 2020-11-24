package control;

import model.Simples;
import model.Express;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Simples();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Express();
		}
	};

	public abstract Frete obterFrete();

}