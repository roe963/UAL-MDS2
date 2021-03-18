import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaValorarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <h4 id="h-producto">Producto</h4>
 <vaadin-horizontal-layout theme="spacing">
  <label style="flex-grow: 0; align-self: center;">Valoración:</label>
  <vaadin-button theme="icon" aria-label="Add new" id="button-valoracion1">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="button-valoracion2">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="button-valoracion3">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="button-valoracion4">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="button-valoracion5">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-text-area label="" placeholder="Opinión" id="textarea-valoracion" style="align-self: stretch;"></vaadin-text-area>
 <vaadin-button id="button-enviarvaloracion">
  Enviar
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-valorarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValorarproducto.is, VistaValorarproducto);
