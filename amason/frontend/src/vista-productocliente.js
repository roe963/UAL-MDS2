import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-producto.js';

class VistaProductocliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vista-producto></vista-producto>
`;
    }

    static get is() {
        return 'vista-productocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductocliente.is, VistaProductocliente);
