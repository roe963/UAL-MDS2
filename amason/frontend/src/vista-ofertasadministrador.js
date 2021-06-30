import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ofertaadministrador.js';

class VistaOfertasadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="layout-ofertas">
 <vista-ofertaadministrador id="vistaOfertaAdministrador" style="align-self: stretch; flex-grow: 1;"></vista-ofertaadministrador>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ofertasadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertasadministrador.is, VistaOfertasadministrador);
