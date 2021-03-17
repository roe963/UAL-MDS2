import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-valoracion.js';

class VistaValoraciones extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-valoracion style="align-self: stretch;"></vista-valoracion>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-valoraciones';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValoraciones.is, VistaValoraciones);
