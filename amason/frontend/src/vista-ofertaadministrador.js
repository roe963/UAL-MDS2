import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaOfertaadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: space-evenly; border: 1px solid black; padding-left: var(--lumo-space-s); padding-right: var(--lumo-space-s);" id="layout-oferta">
 <label id="label-producto" style="width: 25%; flex-shrink: 1; align-self: center;">Producto Oferta</label>
 <label id="label-precio" style="width: 25%; flex-shrink: 1; align-self: center;">Precio Oferta</label>
 <label id="label-fecha" style="width: 25%; flex-shrink: 1; align-self: center;">Fecha Fin Oferta</label>
 <vaadin-button id="button-eliminar" style="width: 25%; flex-shrink: 1; align-self: center;">
  <iron-icon icon="lumo:cross" slot="prefix"></iron-icon>Eliminar 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-ofertaadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertaadministrador.is, VistaOfertaadministrador);
