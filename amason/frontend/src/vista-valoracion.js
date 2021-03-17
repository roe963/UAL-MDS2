import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';

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
 <vaadin-horizontal-layout theme="spacing">
  <iron-icon id="icon1-valoracion"></iron-icon>
  <iron-icon id="icon2-valoracion"></iron-icon>
  <iron-icon id="icon3-valoracion"></iron-icon>
  <iron-icon id="icon4-valoracion"></iron-icon>
  <iron-icon id="icon5-valoracion"></iron-icon>
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
