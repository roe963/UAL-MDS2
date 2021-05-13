import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaValoracion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="hlvaloracion" style="flex-grow: 0;"></vaadin-horizontal-layout>
  <label id="label-fecha">Fecha</label>
 </vaadin-horizontal-layout>
 <label id="label-descripcion" style="align-self: stretch;">Valoración</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-valoracion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValoracion.is, VistaValoracion);
