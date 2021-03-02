import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-oferta`
 *
 * VistaOferta element.
 *
 * @customElement
 * @polymer
 */
class VistaOferta extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);
