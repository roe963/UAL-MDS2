import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <h4 id="h-nombreproducto" style="align-self: center;">Producto</h4>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <label style="flex-grow: 0; align-self: center; margin-right: var(--lumo-space-l);">Puntuación:</label>
  <vaadin-vertical-layout id="layout-selectpuntuacion" style="align-self: center;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-text-area label="" placeholder="Opinión" id="textarea-descripcionvaloracion" style="align-self: center; margin: var(--lumo-space-m); width: 400px; height: 200px;"></vaadin-text-area>
 <vaadin-button id="button-enviarvaloracion" style="align-self: center;">
  Valorar
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
