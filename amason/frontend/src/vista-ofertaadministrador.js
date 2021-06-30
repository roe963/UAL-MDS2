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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: flex-start; margin: var(--lumo-space-m);" id="layout-oferta">
 <label id="label-producto" style="margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-m);">Producto Oferta</label>
 <label id="label-precio" style="margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-m);">Precio Oferta</label>
 <label id="label-fecha" style="margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-m);">Fecha Fin Oferta</label>
 <vaadin-button id="button-eliminar">
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
